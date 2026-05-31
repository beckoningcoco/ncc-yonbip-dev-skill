# |<<

**家庭信息 (hi_psndoc_family / nc.vo.hi.psndoc.FamilyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2566.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | mem_relation | 与本人关系 | mem_relation | char(20) | √ | 与本人关系(自定义档案) (Defdoc-HR024_0xx) |
| 3 | mem_name | 家庭成员姓名 | mem_name | varchar(40) | √ | 字符串 (String) |
| 4 | mem_birthday | 出生日期 | mem_birthday | char(10) |  | 模糊日期 (UFLiteralDate) |
| 5 | mem_corp | 工作单位 | mem_corp | varchar(128) |  | 字符串 (String) |
| 6 | mem_job | 职务 | mem_job | varchar(60) |  | 字符串 (String) |
| 7 | relaaddr | 联系地址 | relaaddr | varchar(128) |  | 字符串 (String) |
| 8 | relaphone | 联系电话 | relaphone | varchar(20) |  | 字符串 (String) |
| 9 | profession | 职业 | profession | varchar(60) |  | 字符串 (String) |
| 10 | politics | 政治面貌 | politics | varchar(20) |  | 政治面貌代码(自定义档案) (Defdoc-HR011_0xx) |
| 11 | memo | 备注 | memo | varchar(1024) |  | 字符串 (String) |
| 12 | begindate | 起始日期 | begindate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 13 | enddate | 终止日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 14 | period | 期间 | period | varchar(10) |  | 字符串 (String) |
| 15 | approveflag | 审批标志 | approveflag | int |  | 整数 (Integer) |
| 16 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 17 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pk_psndoc | 人员主键 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 19 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 20 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 21 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 22 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 24 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |