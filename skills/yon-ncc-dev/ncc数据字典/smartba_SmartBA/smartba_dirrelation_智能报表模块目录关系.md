# |<<

**智能报表模块目录关系 (smartba_dirrelation / nc.vo.smartba.data.Dirrelation)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5371.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dirrelation | 主键ID | pk_dirrelation | char(20) | √ | 主键 (UFID) |
| 2 | domain | 领域编号 | domain | varchar(50) | √ | 字符串 (String) |
| 3 | moduleid | 模块编号 | moduleid | varchar(50) | √ | 字符串 (String) |
| 4 | type | 节点类型 | type | varchar(50) | √ | 字符串 (String) |
| 5 | pk_org | 组织主键 | pk_org | varchar(20) | √ | 字符串 (String) |
| 6 | smartdir | 语义模型目录 | smartdir | varchar(20) |  | 字符串 (String) |
| 7 | freereportdir | 自由报表目录 | freereportdir | varchar(20) |  | 字符串 (String) |