/*
 *  Copyright 2015 the original author or authors.
 *  @https://github.com/david100gom/Bamons
 * <p/>
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * <p/>
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * <p/>
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package bamons.process.batch.support;

import bamons.process.batch.domain.SampleDomain;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleRawDataRowMapper implements RowMapper<SampleDomain> {

    @Override
    public SampleDomain mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        SampleDomain sampleDomain = new SampleDomain();
        sampleDomain.setCode(resultSet.getString("code"));
        sampleDomain.setName(resultSet.getString("name"));
        sampleDomain.setTargetDate(resultSet.getString("targetDate"));
        return sampleDomain;
    }

}