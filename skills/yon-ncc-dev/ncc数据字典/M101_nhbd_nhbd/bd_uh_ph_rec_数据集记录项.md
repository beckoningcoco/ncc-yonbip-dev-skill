# |<<

**数据集记录项 (bd_uh_ph_rec / com.yonyou.yh.nhis.bd.phds.vo.PhDgItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1084.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_phrec | 记录项主键 | pk_phrec | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_phds | 数据集 | pk_phds | varchar(20) |  | 公卫服务数据集 (phds) |
| 5 | pk_phdg | 记录组 | pk_phdg | varchar(50) |  | 字符串 (String) |
| 6 | pk_phdm | 数据元编码 | pk_phdm | varchar(20) |  | 数据元管理 (phdm) |
| 7 | name_dm | 数据元名称 | name_dm | varchar(50) |  | 字符串 (String) |
| 8 | sortno | 组内排序号 | sortno | int |  | 整数 (Integer) |
| 9 | code | 记录项编码 | code | varchar(30) |  | 字符串 (String) |
| 10 | pk_phdmcate | 记录项分类 | pk_phdmcate | varchar(20) |  | 数据元分类 (phdmcate) |
| 11 | name | 记录项名称 | name | varchar(50) |  | 多语文本 (MultiLangText) |
| 12 | dt_rectype | 记录项类型 | dt_rectype | varchar(20) |  | 数据元类型(自定义档案) (Defdoc-070002) |
| 13 | dt_recdatatype | 记录项值域类型 | dt_recdatatype | varchar(20) |  | 数据元值域类型(自定义档案) (Defdoc-070003) |
| 14 | datasource_dttype | 数据元数值域源码表类别 | datasource_dttype | varchar(20) |  | 公卫领域疾病发现编码(自定义档案) (Defdoc-070012) |
| 15 | datasource | 记录数值域源 | datasource | varchar(100) |  | 字符串 (String) |
| 16 | reclen | 记录项长度 | reclen | int |  | 整数 (Integer) |
| 17 | recmax | 记录项最大值 | recmax | int |  | 整数 (Integer) |
| 18 | recmin | 记录项最小值 | recmin | int |  | 整数 (Integer) |
| 19 | recdef | 记录项默认值 | recdef | varchar(50) |  | 字符串 (String) |
| 20 | flag_null | 允许为空 | flag_null | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | data_std_max | 记录项数值标准上限 | data_std_max | varchar(50) |  | 字符串 (String) |
| 22 | data_std_min | 记录项数值标准下限 | data_std_min | varchar(50) |  | 字符串 (String) |
| 23 | data_format | 记录项数值规则串 | data_format | varchar(50) |  | 字符串 (String) |
| 24 | recnote | 记录项意义描述 | recnote | varchar(256) |  | 字符串 (String) |
| 25 | verno | 记录项版本号 | verno | varchar(50) |  | 字符串 (String) |
| 26 | date_publish | 记录项发布日期 | date_publish | char(19) |  | 日期 (UFDate) |
| 27 | flag_active | 记录项启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | weight | 完整率的权重值 | weight | decimal(14, 2) |  | 数值 (UFDouble) |
| 29 | flag_pisyn | 患者信息同步标志 | flag_pisyn | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 31 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 32 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 33 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 34 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |