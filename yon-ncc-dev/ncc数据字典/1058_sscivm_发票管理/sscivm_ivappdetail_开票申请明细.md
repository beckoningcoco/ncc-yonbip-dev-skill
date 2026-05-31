# |<<

**开票申请明细 (sscivm_ivappdetail / nc.vo.sscivm.ivsale.IVApplicationBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5554.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ivappdetail | 开票明细主键 | pk_ivappdetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | fphxz | 发票行性质 | fphxz | int |  | 发票行性质 (fpxz) |  | 0=正常行; |