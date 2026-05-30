# |<<

**业务对象特性关系 (lcdp_busirelation / nc.vo.lcdp.pub.feature.BusirelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3546.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busirelation | pk_busirelation | pk_busirelation | char(20) | √ | 主键 (UFID) |
| 2 | pk_relation | 关联特性主键 | pk_relation | varchar(20) |  | 业务对象特性 (busifeature) |
| 3 | relation_type | 互斥或关联 | relation_type | char(1) |  | 布尔类型 (UFBoolean) |