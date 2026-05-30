# |<<

**分布式资源扩展配置 (bd_distributeres / nc.bs.bd.pub.distribution.DistributeResVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/800.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distributeres | 主键 | pk_distributeres | char(20) | √ | 主键 (UFID) |
| 2 | typecode | 资源编码 | typecode | varchar(40) |  | 字符串 (String) |
| 3 | mdid | 资源主实体元数据ID | mdid | varchar(50) |  | 字符串 (String) |
| 4 | iswithallsubentity | 是否包括所有子实体 | iswithallsubentity | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | subentitynames | 子实体名称 | subentitynames | varchar(200) |  | 字符串 (String) |
| 6 | createstrategy | 创建资源策略 | createstrategy | varchar(100) |  | 字符串 (String) |
| 7 | processorstrategy | 接收资源策略 | processorstrategy | varchar(100) |  | 字符串 (String) |
| 8 | receiptstrategy | 接收回执策略 | receiptstrategy | varchar(100) |  | 字符串 (String) |
| 9 | receiptsavestrategy | 接收保存接口 | receiptsavestrategy | varchar(100) |  | 字符串 (String) |
| 10 | resscopestrategy | 资源范围接口 | resscopestrategy | varchar(100) |  | 字符串 (String) |
| 11 | buildorder | 构建顺序 | buildorder | int |  | 整数 (Integer) | 0 |
| 12 | isdependentmd | 是否是依赖实体 | isdependentmd | char(1) |  | 布尔类型 (UFBoolean) | N |