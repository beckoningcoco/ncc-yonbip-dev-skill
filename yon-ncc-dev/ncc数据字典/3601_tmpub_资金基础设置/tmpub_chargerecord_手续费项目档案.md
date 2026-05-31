# |<<

**手续费项目档案 (tmpub_chargerecord / nc.vo.tmpub.chargerecord.ChargeRecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5759.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_chargerecord | 手续费项目档案主表主键 | pk_chargerecord | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | busitype | 业务类型 | busitype | int |  | 业务类型 (busitype) |  | 1=开信用证; |