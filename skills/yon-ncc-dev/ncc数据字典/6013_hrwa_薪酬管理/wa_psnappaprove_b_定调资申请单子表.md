# |<<

**定调资申请单子表 (wa_psnappaprove_b / nc.vo.wa.adjust.PsnappaproveBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6348.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnapp_b | 定调级申请单子表主键 | pk_psnapp_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_psnapp | 定调级申请单主表主键 | pk_psnapp | char(20) |  | 主键 (UFID) |
| 3 | pk_psndoc | 人员基本信息 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 4 | pk_psnjob | 人员工作记录 | pk_psnjob | varchar(20) | √ | 工作记录 (hi_psnjob) |
| 5 | wa_old_money | 原始金额 | wa_old_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | wa_cofm_money | 批准金额 | wa_cofm_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | wa_apply_money | 申请金额 | wa_apply_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | confirmstate | 审批状态 | confirmstate | int |  | 整数 (Integer) |
| 9 | applyreason | 申请原因 | applyreason | varchar(100) |  | 字符串 (String) |
| 10 | pk_wa_grd | 标准类别主键 | pk_wa_grd | varchar(20) |  | 薪资标准类别表 (WaGrade) |
| 11 | pk_wa_item | 薪资项目主键 | pk_wa_item | varchar(20) |  | 公共薪资项目 (waitem) |
| 12 | negotiation | 谈判工资 | negotiation | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | approved | 批准通过 | approved | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | vnote | 备注 | vnote | varchar(100) |  | 字符串 (String) |
| 15 | pk_wa_prmlv_old | 原薪资级别pk | pk_wa_prmlv_old | varchar(20) |  | 薪资级别表 (WaPrmlvVO) |
| 16 | pk_wa_prmlv_apply | 申请薪资级别pk | pk_wa_prmlv_apply | varchar(20) |  | 薪资级别表 (WaPrmlvVO) |
| 17 | pk_wa_prmlv_cofm | 审批薪资级别pk | pk_wa_prmlv_cofm | varchar(20) |  | 薪资级别表 (WaPrmlvVO) |
| 18 | pk_wa_seclv_old | 原薪资档别pk | pk_wa_seclv_old | varchar(20) |  | 薪资档别表 (WaSeclvVO) |
| 19 | pk_wa_seclv_apply | 申请薪资档别pk | pk_wa_seclv_apply | varchar(20) |  | 薪资档别表 (WaSeclvVO) |
| 20 | pk_wa_seclv_cofm | 审批薪资档别pk | pk_wa_seclv_cofm | varchar(20) |  | 薪资档别表 (WaSeclvVO) |
| 21 | wa_crt_apply_money | 申请级别金额 | wa_crt_apply_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | wa_crt_cofm_money | 审批级别金额 | wa_crt_cofm_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | wa_crt_old_money | 原薪级别金额 | wa_crt_old_money | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | crt_min_value | 薪资标准最小值 | crt_min_value | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | crt_max_value | 薪资标准最大值 | crt_max_value | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | pk_wa_crt | 薪资标准 | pk_wa_crt | char(20) |  | 主键 (UFID) |
| 27 | usedate | 生效日期 | usedate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 28 | partflag | 兼职 | partflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 29 | assgid | 人员任职ID | assgid | int |  | 整数 (Integer) |
| 30 | pk_changecause | 变动原因 | pk_changecause | varchar(20) |  | 薪资变动原因(自定义档案) (Defdoc-HRWA001_0xx) |