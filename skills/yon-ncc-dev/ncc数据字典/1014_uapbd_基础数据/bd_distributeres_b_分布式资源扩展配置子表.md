# |<<

**分布式资源扩展配置子表 (bd_distributeres_b / nc.bs.bd.pub.distribution.DistributeResBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/801.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distributeres_b | 主键 | pk_distributeres_b | char(20) | √ | 主键 (UFID) |
| 2 | metaproperty | 元数据属性 | metaproperty | varchar(100) | √ | 字符串 (String) |
| 3 | isupload | 是否上传 | isupload | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | editable | 是否可编辑 | editable | char(1) |  | 布尔类型 (UFBoolean) |