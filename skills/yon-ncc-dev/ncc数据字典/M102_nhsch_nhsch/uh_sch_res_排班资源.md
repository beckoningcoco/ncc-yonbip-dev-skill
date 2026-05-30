# |<<

**排班资源 (uh_sch_res / com.yonyou.yh.nhis.sch.res.vo.SchResVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6266.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_res | 排班资源主键 | pk_res | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_schcate | 排班分类 | pk_schcate | varchar(20) |  | 排班分类 (SchcateVO) |
| 5 | pk_restype | 资源类型 | pk_restype | varchar(20) |  | 资源类型(自定义档案) (Defdoc-010003) |
| 6 | dt_restype | 资源类型编码 | dt_restype | varchar(20) |  | 字符串 (String) |
| 7 | code_res | 资源编码 | code_res | varchar(30) |  | 字符串 (String) |
| 8 | name_res | 资源名称 | name_res | varchar(50) |  | 多语文本 (MultiLangText) |
| 9 | desc_res | 排班资源描述 | desc_res | varchar(4000) |  | 字符串 (String) |
| 10 | mnecode | 输入码 | mnecode | varchar(50) |  | 字符串 (String) |
| 11 | minute_per | 占用时间(分钟) | minute_per | int |  | 整数 (Integer) |
| 12 | pk_ticketrules | 排班生成规则 | pk_ticketrules | varchar(20) |  | 排班_号表生成规则 (SchRuleVO) |
| 13 | pk_dept | 资源归属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 14 | code_dept | 对应科室 | code_dept | varchar(20) |  | 组织_部门 (dept) |
| 15 | code_psn | 对应人员 | code_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | code_bed | 对应床位 | code_bed | varchar(20) |  | 床位 (bed) |
| 17 | code_opt | 对应手术台 | code_opt | varchar(20) |  | 手术台 (opttbl) |
| 18 | code_msp | 对应医技 | code_msp | varchar(20) |  | 医技资源设备 (MedSrvPVO) |
| 19 | pk_srv | 检查项目 | pk_srv | varchar(20) |  | 医疗服务字典 (uhsrv) |
| 20 | pk_bodypart | 检查部位 | pk_bodypart | varchar(500) |  | 字符串 (String) |
| 21 | name_bodypart | 检查部位名称 | name_bodypart | varchar(500) |  | 字符串 (String) |
| 22 | flag_stop | 停止标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) | N |
| 23 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 24 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 44 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 45 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 46 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 47 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |