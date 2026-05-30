# |<<

**影响因素关联定义 (fip_classfactor / nc.vo.fip.classdef.ClassFactorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2226.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_classfactor | 对象标识 | pk_classfactor | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | desdoctype | 目标档案类型 | desdoctype | varchar(50) |  | 字符串 (String) |
| 5 | pk_factor1 | 影响因素1 | pk_factor1 | varchar(20) |  | 影响因素 (factor) |
| 6 | pk_factor2 | 影响因素2 | pk_factor2 | varchar(20) |  | 影响因素 (factor) |
| 7 | pk_factor3 | 影响因素3 | pk_factor3 | varchar(20) |  | 影响因素 (factor) |
| 8 | pk_factor4 | 影响因素4 | pk_factor4 | varchar(20) |  | 影响因素 (factor) |
| 9 | pk_factor5 | 影响因素5 | pk_factor5 | varchar(20) |  | 影响因素 (factor) |
| 10 | pk_factor6 | 影响因素6 | pk_factor6 | varchar(20) |  | 影响因素 (factor) |
| 11 | pk_factor7 | 影响因素7 | pk_factor7 | varchar(20) |  | 影响因素 (factor) |
| 12 | pk_factor8 | 影响因素8 | pk_factor8 | varchar(20) |  | 影响因素 (factor) |
| 13 | pk_factor9 | 影响因素9 | pk_factor9 | varchar(20) |  | 影响因素 (factor) |
| 14 | displayname | 显示名称 | displayname | varchar(200) |  | 多语文本 (MultiLangText) |
| 15 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 16 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 18 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |