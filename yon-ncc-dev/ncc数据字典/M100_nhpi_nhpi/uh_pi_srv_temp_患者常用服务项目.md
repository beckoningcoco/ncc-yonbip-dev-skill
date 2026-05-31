# |<<

**患者常用服务项目 (uh_pi_srv_temp / com.yonyou.yh.nhis.pi.patisrv.vo.PatiSrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6205.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patisrv | 患者常用服务项目主键 | pk_patisrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | grno | 组号 | grno | decimal(14, 2) |  | 数值 (UFDouble) |
| 6 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 7 | pk_pd | 默认物品 | pk_pd | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | pk_freq | 医嘱频次 | pk_freq | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 9 | pk_useage | 用法 | pk_useage | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 10 | dt_useage | 用法编码 | dt_useage | varchar(50) |  | 字符串 (String) |
| 11 | pk_usegenote | 用法要求 | pk_usegenote | varchar(20) |  | 药品用法要求(自定义档案) (Defdoc-030408) |
| 12 | dt_usegenote | 用法要求编码 | dt_usegenote | varchar(50) |  | 字符串 (String) |
| 13 | quan | 单次量 | quan | decimal(14, 2) |  | 数值 (UFDouble) |
| 14 | pk_measdoc | 医疗单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 15 | day | 开立天数 | day | int |  | 整数 (Integer) |
| 16 | date_create | 建立日期 | date_create | char(19) |  | 日期 (UFDate) |
| 17 | pk_psn_create | 建立人员 | pk_psn_create | varchar(20) |  | 人员基本信息 (psndoc) |
| 18 | pk_org_create | 建立机构 | pk_org_create | varchar(20) |  | 组织 (org) |
| 19 | pk_dept_create | 建立部门 | pk_dept_create | varchar(20) |  | 组织_部门 (dept) |
| 20 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 22 | code_srv | 服务编码 | code_srv | varchar(50) |  | 字符串 (String) |
| 23 | code_pd | 默认物品编码 | code_pd | varchar(50) |  | 字符串 (String) |
| 24 | name_psn_create | 建立人员名称 | name_psn_create | varchar(50) |  | 字符串 (String) |
| 25 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 26 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 27 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 28 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |