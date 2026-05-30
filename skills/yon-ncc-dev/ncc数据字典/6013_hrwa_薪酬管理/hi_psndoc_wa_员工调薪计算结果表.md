# |<<

**员工调薪计算结果表 (hi_psndoc_wa / nc.vo.wa.paydata.PsndocWaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2590.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_wa | 主键 | pk_psndoc_wa | char(20) | √ | 主键 (UFID) |
| 2 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | varchar(20) |  | 主键 (UFID) |
| 3 | pk_psnjob | 人员管理档案主键 | pk_psnjob | varchar(20) |  | 主键 (UFID) |
| 4 | pk_wa_class | 薪资类别 | pk_wa_class | varchar(20) |  | 主键 (UFID) |
| 5 | cyear | 工资年度 | cyear | char(4) |  | 主键 (UFID) |
| 6 | cperiod | 工资期间 | cperiod | char(2) |  | 主键 (UFID) |
| 7 | pk_wa_item | 薪资项目 | pk_wa_item | varchar(20) |  | 主键 (UFID) |
| 8 | nmoney | 发放金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nbeforemoney | 调薪前日薪 | nbeforemoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nceforedays | 调薪前天数 | nceforedays | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | naftermoney | 调薪后日薪 | naftermoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nafterdays | 调薪后天数 | nafterdays | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | iwatype | 计算类型 | iwatype | int |  | 整数 (Integer) |
| 14 | daywage | 日薪指定方式 | daywage | int |  | 整数 (Integer) |
| 15 | pk_psndoc | 人员基本档案主键 | pk_psndoc | varchar(20) |  | 主键 (UFID) |
| 16 | basedays | 基准天数 | basedays | decimal(28, 8) |  | 数值 (UFDouble) | 20.92 |
| 17 | sub_ts | 定调资数据ts | sub_ts | char(19) |  | 日期时间 (UFDateTime) |
| 18 | pre_sub_id | 上条定调资数据 | pre_sub_id | varchar(20) |  | 字符串 (String) |
| 19 | pre_sub_ts | 上条定调资数据ts | pre_sub_ts | char(19) |  | 日期时间 (UFDateTime) |
| 20 | assgid | 人员任职ID | assgid | int |  | 整数 (Integer) |