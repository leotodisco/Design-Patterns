package org.structural.datasource.decorator;

import lombok.AllArgsConstructor;
import org.structural.datasource.IDataSource;

import javax.sql.DataSource;

@AllArgsConstructor
public abstract class DataSourceDecorator implements IDataSource {
    protected IDataSource fileDataSource;

}
