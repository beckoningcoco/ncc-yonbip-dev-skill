# |<<

**身份证件 (hi_psndoc_cert / nc.vo.hi.psndoc.CertVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2558.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | idtype | 证件类型 | idtype | varchar(20) | √ | 证件类别 (psnidtype) |
| 3 | id | 证件号码 | id | varchar(50) | √ | 字符串 (String) |
| 4 | begindate | 发证日期 | begindate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 5 | enddate | 有效期限 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 6 | extend_org | 发证机构 | extend_org | varchar(200) |  | 字符串 (String) |
| 7 | iseffect | 有效 | iseffect | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isstart | 默认 | isstart | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | memo | 说明 | memo | varchar(1024) |  | 备注 (Memo) |
| 10 | pk_psndoc | 基本信息主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 11 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 12 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 13 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 14 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 16 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 18 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |