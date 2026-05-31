# |<<

**票据帐日发生额 (fbm_billacc_dailysum / nc.vo.fbm.billacc.BillAccDailyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2113.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dailysum | 主键 | pk_dailysum | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织pk | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | tallydate | 记账日期 | tallydate | char(19) |  | 日期 (UFDate) |
| 4 | billclass | 票据大类 | billclass | int |  | 票据大类 (noteclass) |  | 1=支票; |