# |<<

**员工能力素质 (hi_psndoc_capa / nc.vo.hi.psndoc.CapaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2557.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | pk_pe_indi | 指标名称 | pk_pe_indi | varchar(20) | √ | 能力素质指标 (cpindi) |
| 3 | pk_pe_scogrditem | 员工达到等级 | pk_pe_scogrditem | varchar(20) | √ | 能力素质指标等级 (cpindigrade) |
| 4 | eva_date | 评价日期 | eva_date | char(10) |  | 模糊日期 (UFLiteralDate) |
| 5 | lastflag | 最新标识 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 7 | begindate | 起始日期 | begindate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 8 | enddate | 终止日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 9 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 10 | pk_psndoc | 人员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 11 | score | 指标等级数值 | score | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 13 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 14 | indicode | 指标编码 | indicode | varchar(80) |  | 字符串 (String) |
| 15 | pk_indi_type | 指标类型 | pk_indi_type | varchar(20) |  | 能力素质指标类型 (cpinditype) |
| 16 | scorestandard | 指标定义/要素 | scorestandard | varchar(3000) |  | 字符串 (String) |
| 17 | asssourcetype | 评估来源类型 | asssourcetype | int |  | 评估来源类型 (assSourceType) |  | 0=能力素质评估; |