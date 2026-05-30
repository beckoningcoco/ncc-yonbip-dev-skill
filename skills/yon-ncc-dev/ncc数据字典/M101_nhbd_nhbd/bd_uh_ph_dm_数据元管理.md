# |<<

**数据元管理 (bd_uh_ph_dm / com.yonyou.yh.nhis.bd.phdm.vo.PhDmVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1081.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_phdm | 数据元主键 | pk_phdm | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 数据元编码 | code | varchar(30) |  | 字符串 (String) |
| 5 | name | 数据元名称 | name | varchar(50) |  | 多语文本 (MultiLangText) |
| 6 | pk_phdmcate | 数据元分类 | pk_phdmcate | varchar(20) |  | 数据元分类 (phdmcate) |
| 7 | dt_rectype | 数据元类型 | dt_rectype | varchar(20) |  | 数据元类型(自定义档案) (Defdoc-070002) |
| 8 | dt_recdatatype | 数据元值域类型 | dt_recdatatype | varchar(20) |  | 数据元值域类型(自定义档案) (Defdoc-070003) |
| 9 | datasource | 数据元数值域源 | datasource | varchar(100) |  | 字符串 (String) |
| 10 | datasource_dttype | 数据元数值域源码表类别 | datasource_dttype | varchar(20) |  | 公卫领域疾病发现编码(自定义档案) (Defdoc-070012) |
| 11 | reclen | 数据元长度 | reclen | int |  | 整数 (Integer) |
| 12 | recmax | 数据元最大值 | recmax | int |  | 整数 (Integer) |
| 13 | recmin | 数据元最小值 | recmin | int |  | 整数 (Integer) |
| 14 | recdef | 数据元默认值 | recdef | varchar(50) |  | 字符串 (String) |
| 15 | flag_null | 允许为空 | flag_null | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | data_std_max | 数据元数值标准上限 | data_std_max | varchar(50) |  | 字符串 (String) |
| 17 | data_std_min | 数据元数值标准下限 | data_std_min | varchar(50) |  | 字符串 (String) |
| 18 | data_format | 数据元数值规则串 | data_format | varchar(50) |  | 字符串 (String) |
| 19 | recnote | 数据元意义描述 | recnote | varchar(256) |  | 字符串 (String) |
| 20 | code_gb | 数据元国家标准编码 | code_gb | varchar(30) |  | 字符串 (String) |
| 21 | flag_active | 数据元启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | verno | 数据元版本号 | verno | varchar(50) |  | 字符串 (String) |
| 23 | date_publish | 数据元发布日期 | date_publish | char(19) |  | 日期时间 (UFDateTime) |
| 24 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_人力资源组织版本信息 (hrorg_v) |
| 25 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 26 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 27 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 28 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |