# |<<

**成本资料关帐记录 (scaba_dataclose / nc.vo.scaba.beginaccount.entity.DataCloseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5083.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdatacloseid | 成本资料关帐记录 | cdatacloseid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 主键 (UFID) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) | √ | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | pk_org_co | 业务单元 | pk_org_co | varchar(20) | √ | 组织 (org) |
| 6 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) | √ | 账簿_核算账簿 (accbook) |
| 7 | cperiod | 会计期间 | cperiod | varchar(20) | √ | 会计月份 (accperiodmonth) |
| 8 | iaccountstatus | 关结账状态 | iaccountstatus | int | √ | 关结账标志 (AccountStatusEnum) | 3 | 1=未结账; |