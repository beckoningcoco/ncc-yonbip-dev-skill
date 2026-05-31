# |<<

**合同交易类型 (ct_business / nc.vo.ct.business.entity.BusinessSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1658.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_business | 交易类型定义主键 | pk_business | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | ninvctlstyle | 物料控制方式 | ninvctlstyle | int |  | 物料控制方式 (Ninvctlstyle) |  | 1=物料; |