# |<<

**医疗服务字典 (bd_uh_srv / com.yonyou.nhis.bd.pub2.srv.vo.UhSrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1105.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srv | 服务主键 | pk_srv | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_srvtype | 服务类型 | pk_srvtype | char(20) |  | 主键 (UFID) |
| 5 | code | 服务编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 服务名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | flag_ctl_srv | 控制标志_互斥 | flag_ctl_srv | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | flag_ctl_psn | 控制标志_人员 | flag_ctl_psn | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | flag_nurse | 护理可用标志 | flag_nurse | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_freq | 默认值_频次 | pk_freq | char(20) |  | 主键 (UFID) |
| 12 | pk_usage | 默认值_用法 | pk_usage | char(20) |  | 主键 (UFID) |
| 13 | usagenote | 默认值_用法要求 | usagenote | varchar(50) |  | 字符串 (String) |
| 14 | quan_def | 默认用量 | quan_def | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | pk_measdoc_def | 默认用量单位 | pk_measdoc_def | char(20) |  | 主键 (UFID) |
| 16 | flag_pd | 物品标志 | flag_pd | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | flag_use_ip | 可使用标志_住院 | flag_use_ip | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | flag_use_op | 可使用标志_门诊 | flag_use_op | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | flag_use_er | 可使用标志_急诊 | flag_use_er | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | flag_use_hm | 可使用标志_家庭病房 | flag_use_hm | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | flag_use_pe | 可使用标志_体检 | flag_use_pe | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | flag_emr | 医疗记录联动标志 | flag_emr | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | flag_bl | 记费标志 | flag_bl | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | pk_srvordfrom | 服务医疗单 | pk_srvordfrom | char(20) |  | 主键 (UFID) |
| 25 | pk_srvordases | 服务开立评估 | pk_srvordases | char(20) |  | 主键 (UFID) |
| 26 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | code_srvtype | 服务类型编码 | code_srvtype | varchar(50) |  | 字符串 (String) |
| 28 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 29 | pk_srvcate | 医疗服务基础分类 | pk_srvcate | char(20) |  | 主键 (UFID) |
| 30 | pk_measdoc | 单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 31 | expert | 通用性 | expert | varchar(200) |  | 字符串 (String) |
| 32 | work | 作用 | work | varchar(200) |  | 字符串 (String) |
| 33 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 34 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 35 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 36 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |