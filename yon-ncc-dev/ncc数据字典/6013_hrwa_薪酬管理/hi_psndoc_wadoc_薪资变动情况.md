# |<<

**薪资变动情况 (hi_psndoc_wadoc / nc.vo.hi.wadoc.PsndocWadocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2591.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_psndoc | 人员基本信息 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 3 | pk_psnjob | 人员任职记录 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 4 | negotiation_wage | 是否是谈判工资 | negotiation_wage | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | workflowflag | 是否是来自于流程 | workflowflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | begindate | 薪资起始日期 | begindate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 7 | enddate | 薪资截止日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 8 | cyear | 工资年度 | cyear | char(4) |  | 主键 (UFID) |
| 9 | cperiod | 工资期间 | cperiod | char(2) |  | 主键 (UFID) |
| 10 | iadjustmatter | 业务类型 | iadjustmatter | int |  | 整数 (Integer) |
| 11 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 12 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_wa_item | 薪资项目 | pk_wa_item | varchar(20) |  | 公共薪资项目 (waitem) |
| 14 | pk_wa_crt | 薪资标准 | pk_wa_crt | char(20) |  | 主键 (UFID) |
| 15 | nmoney | 金额 | nmoney | decimal(31, 8) |  | 数值 (UFDouble) |
| 16 | pk_wa_grd | 薪资标准类别 | pk_wa_grd | varchar(20) |  | 薪资标准类别表 (WaGrade) |
| 17 | waflag | 发放标志 | waflag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | changedate | 薪资调整日期 | changedate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 19 | pk_changecause | 变动原因 | pk_changecause | varchar(20) |  | 薪资变动原因(自定义档案) (Defdoc-HRWA001_0xx) |
| 20 | nprobationwage | 试用期工资 | nprobationwage | decimal(31, 8) |  | 数值 (UFDouble) |
| 21 | vbasefile | 依据文件 | vbasefile | varchar(50) |  | 字符串 (String) |
| 22 | vnote | 备注 | vnote | varchar(50) |  | 字符串 (String) |
| 23 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 24 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 25 | criterionvalue | 标准金额 | criterionvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | pk_wa_prmlv | 薪资标准级别 | pk_wa_prmlv | varchar(20) |  | 薪资级别表 (WaPrmlvVO) |
| 27 | pk_wa_seclv | 薪资标准档别 | pk_wa_seclv | varchar(20) |  | 薪资档别表 (WaSeclvVO) |
| 28 | crt_min_value | 标准最小值 | crt_min_value | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | crt_max_value | 标准最大值 | crt_max_value | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | partflag | 兼职 | partflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 31 | assgid | 人员任职ID | assgid | int |  | 整数 (Integer) |