# |<<

**薪资发放数据 (wa_data / nc.vo.wa.payslip.WaDataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6327.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_data | pk_wa_data | pk_wa_data | char(20) | √ | 主键 (UFID) |
| 2 | cyear | 会计年度 | cyear | char(50) |  | 字符串 (String) |
| 3 | cperiod | 会计月度 | cperiod | char(50) |  | 字符串 (String) |
| 4 | pk_psnjob | 人员工作记录 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 5 | pk_psndoc | 人员信息 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |