# |<<

**临床门诊病历 (uh_cn_mr_op / com.yonyou.yh.nhis.cn.ecd.vo.CNmrOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6015.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_opmr | 临床门诊病历 | pk_opmr | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 6 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(30) |  | 字符串 (String) |
| 7 | pk_pv | 就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 8 | problem | 主诉 | problem | varchar(256) |  | 字符串 (String) |
| 9 | present | 现病史 | present | varchar(256) |  | 字符串 (String) |
| 10 | history | 既往史 | history | varchar(256) |  | 字符串 (String) |
| 11 | allergy | 过敏史 | allergy | varchar(256) |  | 字符串 (String) |
| 12 | height | 身高 | height | decimal(14, 2) |  | 数值 (UFDouble) |
| 13 | weight | 体重 | weight | decimal(14, 2) |  | 数值 (UFDouble) |
| 14 | temperature | 体温 | temperature | decimal(14, 2) |  | 数值 (UFDouble) |
| 15 | sbp | 伸缩压 | sbp | int |  | 整数 (Integer) |
| 16 | dbp | 舒张压 | dbp | int |  | 整数 (Integer) |
| 17 | exam_phy | 体格检查 | exam_phy | varchar(256) |  | 字符串 (String) |
| 18 | exam_aux | 辅助检查 | exam_aux | varchar(256) |  | 字符串 (String) |
| 19 | date_mr | 病历日期 | date_mr | char(20) |  | 日期时间 (UFDateTime) |
| 20 | pk_dept | 科室 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 21 | pk_psn | 医师 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 22 | name_psn | 医师姓名 | name_psn | varchar(50) |  | 字符串 (String) |
| 23 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 24 | pk_cnet | 临床事件 | pk_cnet | varchar(20) |  | 临床_事件 (cnevent) |
| 25 | diag_opinion | 诊断意见 | diag_opinion | varchar(50) |  | 字符串 (String) |
| 26 | disease_treatment | 病情及治疗经过 | disease_treatment | varchar(50) |  | 字符串 (String) |
| 27 | hand_suggestion | 处理意见 | hand_suggestion | varchar(50) |  | 字符串 (String) |
| 28 | flag_flu | 流感病例标识 | flag_flu | char(1) |  | 布尔类型 (UFBoolean) | 'N' |
| 29 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 46 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 47 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 48 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |
| 49 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |