# |<<

**床位 (bd_uh_bed / com.yonyou.yh.nhis.bd.bed.vo.BedVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1017.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bed | 床位主键 | pk_bed | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 床位编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 床位名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_bedtype | 床位类型主键 | pk_bedtype | varchar(20) |  | 床位类型(自定义档案) (Defdoc-010400) |
| 7 | dt_bedtype | 床位类型编码 | dt_bedtype | varchar(50) |  | 字符串 (String) |
| 8 | pk_sex | 可用性别主键 | pk_sex | varchar(20) |  | 性别(自定义档案) (Defdoc-000000) |
| 9 | dt_sex | 可用性别编码 | dt_sex | varchar(50) |  | 字符串 (String) |
| 10 | mnecode | 输入码 | mnecode | varchar(50) |  | 字符串 (String) |
| 11 | pk_item | 费用编码 | pk_item | varchar(50) |  | 字符串 (String) |
| 12 | pk_dept | 所属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 13 | pk_dept_used | 使用部门 | pk_dept_used | varchar(20) |  | 组织_部门 (dept) |
| 14 | houseno | 所在房间 | houseno | varchar(50) |  | 字符串 (String) |
| 15 | flag_active | 开放标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | flag_temp | 加床标志 | flag_temp | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | pk_status | 床位状态主键 | pk_status | varchar(20) |  | 床位状态(自定义档案) (Defdoc-010401) |
| 18 | dt_status | 床位状态编码 | dt_status | varchar(50) |  | 字符串 (String) |
| 19 | flag_occupy | 占用标志 | flag_occupy | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | pk_pati | 患者编码 | pk_pati | varchar(50) |  | 字符串 (String) |
| 21 | code_fa | 对应设备编码 | code_fa | varchar(50) |  | 字符串 (String) |
| 22 | pk_place | 床位地点 | pk_place | varchar(20) |  | 位置管理 (uhplace) |
| 23 | name_place | 地址 | name_place | varchar(50) |  | 字符串 (String) |
| 24 | pk_psn_phy | 当前主管医生 | pk_psn_phy | varchar(20) |  | 人员基本信息 (psndoc) |
| 25 | name_psn_phy | 当前主管医生姓名 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 26 | pk_psn_ns | 当前责任护士 | pk_psn_ns | varchar(20) |  | 人员基本信息 (psndoc) |
| 27 | name_psn_ns | 当前责任护士姓名 | name_psn_ns | varchar(50) |  | 字符串 (String) |
| 28 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 29 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 30 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 31 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |