# |<<

**职业资格 (hi_psndoc_nationduty / nc.vo.hi.psndoc.NationDutyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2574.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | workname | 职业资格 | workname | char(20) | √ | 职业资格(自定义档案) (Defdoc-HR017_0xx) |
| 3 | pk_cert | 证书档案主键 | pk_cert | varchar(20) |  | 证书档案 (ctffile) |
| 4 | certificatenum | 证书编号 | certificatenum | varchar(200) |  | 字符串 (String) |
| 5 | occupation | 职业 | occupation | varchar(20) |  | 职业(自定义档案) (Defdoc-HR016_0xx) |
| 6 | worklevel | 资格等级 | worklevel | varchar(20) |  | 职业资格等级(自定义档案) (Defdoc-HR018_0xx) |
| 7 | occuptype | 工种 | occuptype | varchar(20) |  | 工种(自定义档案) (Defdoc-BD004_0xx) |
| 8 | workunitname | 评定机构 | workunitname | varchar(128) |  | 字符串 (String) |
| 9 | workdate | 获得日期 | workdate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 10 | istop | 最高 | istop | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 12 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_psndoc | 人员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 14 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 15 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 16 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 17 | pk_psnjob | 工作记录主键 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 18 | activecode | 对应培训活动编码 | activecode | varchar(40) |  | 字符串 (String) |
| 19 | coursecode | 对应课程编码 | coursecode | varchar(40) |  | 字符串 (String) |
| 20 | activename | 对应培训活动名称 | activename | varchar(200) |  | 多语文本 (MultiLangText) |
| 21 | coursename | 对应课程名称 | coursename | varchar(200) |  | 多语文本 (MultiLangText) |
| 22 | remark | 备注 | remark | varchar(500) |  | 备注 (Memo) |
| 23 | sourcetype | 记录来源 | sourcetype | int |  | 记录来源 (sourcetype) |  | 1=培训活动颁发; |