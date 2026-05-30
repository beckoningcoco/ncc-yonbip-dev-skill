# |<<

**成本分解结构成员 (bd_cbsnode / nc.vo.bd.cbs.CBSNodeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/391.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cbsnode | 主键 | pk_cbsnode | char(20) | √ | 主键 (UFID) |
| 2 | pk_projecttype | 项目类型 | pk_projecttype | varchar(20) |  | 项目基本分类 (EpsVO) |
| 3 | code | 成员编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 成员名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | pk_father | 上级成员 | pk_father | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 6 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 7 | assetclass | 资产类别 | assetclass | varchar(50) |  | 字符串 (String) |
| 8 | isleafnode | 末级结点 | isleafnode | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isalloc | 待摊销 | isalloc | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 12 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 13 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 14 | free1 | 自定义项1 | free1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | free2 | 自定义项2 | free2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | free3 | 自定义项3 | free3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | free4 | 自定义项4 | free4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | free5 | 自定义项5 | free5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | free6 | 自定义项6 | free6 | varchar(101) |  | 自定义项 (Custom) |
| 20 | free7 | 自定义项7 | free7 | varchar(101) |  | 自定义项 (Custom) |
| 21 | free8 | 自定义项8 | free8 | varchar(101) |  | 自定义项 (Custom) |
| 22 | free9 | 自定义项9 | free9 | varchar(101) |  | 自定义项 (Custom) |
| 23 | free10 | 自定义项10 | free10 | varchar(101) |  | 自定义项 (Custom) |
| 24 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 25 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 26 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 27 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |