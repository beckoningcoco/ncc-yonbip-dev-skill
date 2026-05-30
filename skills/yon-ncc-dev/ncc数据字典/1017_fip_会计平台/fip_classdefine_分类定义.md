# |<<

**分类定义 (fip_classdefine / nc.vo.fip.classdef.ClassDefineVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2224.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_classdef | 对象标识 | pk_classdef | char(20) | √ | 主键 (UFID) |
| 2 | pk_classmainprop | 主属性 | pk_classmainprop | varchar(20) |  | 分类主属性定义 (classmainprop) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | char(20) |  | 主键 (UFID) |
| 5 | displaycode | 编码 | displaycode | varchar(40) |  | 字符串 (String) |
| 6 | displayname | 名称 | displayname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | pk_classfactor | 影响因素 | pk_classfactor | varchar(20) |  | 影响因素关联定义 (classfactor) |
| 8 | pk_classfactor2 | 影响因素排列 | pk_classfactor2 | varchar(20) |  | 影响因素关联定义 (classfactor) |
| 9 | pk_classview | 对照表 | pk_classview | varchar(20) |  | 对照表 (docview) |
| 10 | src_system | 来源系统 | src_system | varchar(50) |  | 字符串 (String) |
| 11 | src_billtype | 来源单据类型 | src_billtype | varchar(20) |  | 字符串 (String) |
| 12 | des_system | 目标系统 | des_system | varchar(50) |  | 字符串 (String) |
| 13 | des_billtype | 目标单据类型 | des_billtype | varchar(20) |  | 字符串 (String) |
| 14 | desdoctype | 目标档案类型 | desdoctype | varchar(36) |  | 实体 (entity) |
| 15 | iscopyfromgroup | 从集团复制到组织 | iscopyfromgroup | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | pk_org_to_copy | 复制目的组织 | pk_org_to_copy | varchar(20) |  | 组织 (org) |
| 17 | defaultvalue | 默认值 | defaultvalue | varchar(101) |  | 自定义项 (Custom) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |