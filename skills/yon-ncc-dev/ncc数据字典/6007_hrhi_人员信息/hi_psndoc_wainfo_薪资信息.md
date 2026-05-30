# |<<

**薪资信息 (hi_psndoc_wainfo / nc.vo.hi.psndoc.WainfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2592.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | wa_crt | 标准类别 | wa_crt | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | wa_item | 薪资项目 | wa_item | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | changecause | 变动原因 | changecause | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | pk_org | 定薪组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 6 | begindate | 薪资起始日期 | begindate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 7 | enddate | 薪资截止日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 8 | wa_prmlv | 薪资级别 | wa_prmlv | varchar(200) |  | 字符串 (String) |
| 9 | wa_seclv | 薪资档别 | wa_seclv | varchar(200) |  | 字符串 (String) |
| 10 | criterionvalue | 标准金额 | criterionvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | waflag | 发放标志 | waflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | lastflag | 最近标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 15 | pk_psndoc | 人员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 16 | pk_psnjob | 任职主键 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 17 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 18 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 19 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 22 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |