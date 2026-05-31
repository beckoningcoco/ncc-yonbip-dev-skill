# |<<

**业务分类_单据类型_关系 (org_sscbusiunitclientage / nc.vo.ssc.task.businessunittype.BusiUnitClientageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4170.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiclientage | 关系主键 | pk_busiclientage | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | pk_busiunit | 业务分类主键 | pk_busiunit | varchar(20) |  | 业务分类 (sscbusinessunittype) |