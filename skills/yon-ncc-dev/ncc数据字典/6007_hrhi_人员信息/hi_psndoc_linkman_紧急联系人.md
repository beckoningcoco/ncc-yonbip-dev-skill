# |<<

**紧急联系人 (hi_psndoc_linkman / nc.vo.hi.psndoc.LinkmanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2573.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | linkman | 联系人 | linkman | varchar(200) | √ | 字符串 (String) |
| 3 | relation | 与联系人关系 | relation | varchar(128) |  | 字符串 (String) |
| 4 | ismain | 主要联系人 | ismain | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | linkaddr | 联系地址 | linkaddr | varchar(256) |  | 字符串 (String) |
| 6 | postalcode | 邮政编码 | postalcode | varchar(20) |  | 字符串 (String) |
| 7 | officephone | 办公电话 | officephone | varchar(30) |  | 字符串 (String) |
| 8 | homephone | 家庭电话 | homephone | varchar(30) |  | 字符串 (String) |
| 9 | mobile | 手机 | mobile | varchar(30) |  | 字符串 (String) |
| 10 | fax | 传真 | fax | varchar(30) |  | 字符串 (String) |
| 11 | email | 电子邮件 | email | varchar(50) |  | 字符串 (String) |
| 12 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 13 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_psndoc | 人员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 15 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 16 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 17 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |