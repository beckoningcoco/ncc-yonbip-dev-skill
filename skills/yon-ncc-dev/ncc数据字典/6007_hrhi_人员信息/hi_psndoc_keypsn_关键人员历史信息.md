# |<<

**关键人员历史信息 (hi_psndoc_keypsn / nc.vo.hi.psndoc.KeyPsnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2567.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | begindate | 开始日期 | begindate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 3 | enddate | 结束日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | pk_keypsn_grp | 关键人员组 | pk_keypsn_grp | char(20) | √ | 关键人员组 (hi_keypsn_group) |
| 5 | endflag | 结束 | endflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 10 | lastflag | 最新标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_psndoc | 人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 12 | pk_psnorg | 组织关系 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |