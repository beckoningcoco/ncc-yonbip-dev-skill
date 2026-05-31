# |<<

**岗位继任人选 (om_postcandidate / nc.vo.om.candidate.CandidateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3955.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | 继任人员主键 | pk_post_sub | char(20) | √ | 主键 (UFID) |
| 2 | iorder | 序号 | iorder | int |  | 整数 (Integer) |
| 3 | pk_psndoc | 人员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 4 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 组织主键 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_post | 岗位主键 | pk_post | varchar(20) |  | 岗位基本信息 (om_post) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |