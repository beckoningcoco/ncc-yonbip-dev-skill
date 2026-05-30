# |<<

**合并报表报送活动选择报表状态 (ufoc_commitactselrep / nc.vo.hbbb.commit.UFOCCommitActionSelRepVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5865.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repstate | 主键 | pk_repstate | char(20) | √ | 主键 (UFID) |
| 2 | noneinputflag | 是否可空表报送 | noneinputflag | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | repcode | 报表编码 | repcode | varchar(50) |  | 字符串 (String) |
| 4 | repname | 报表名称 | repname | varchar(50) |  | 字符串 (String) |
| 5 | class_name | 所属分类 | class_name | varchar(50) |  | 字符串 (String) |
| 6 | commitattr | 报送属性 | commitattr | int |  | 报表报送属性 (enum_commitstate) |  | 0=必报必录; |