# |<<

**期末结账表 (cm_account / nc.vo.cm.accountsettle.entity.AccountSettleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1431.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | caccountid | 期末结账 | caccountid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(0) | √ | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | char(20) | √ | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | char(20) | √ | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(20) | √ | 会计月份 (accperiodmonth) |
| 6 | iaccountstatus | 期末结账状态 | iaccountstatus | int | √ | 期末结账状态 (AccountStatusEnum) | 1 | 1=未结账; |