# |<<

**临床_医嘱_会诊申请表属性 (uh_cn_ord_consult / com.yonyou.yh.nhis.cn.ord.vo.UhCNOrderConsultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6018.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordcon | 会诊申请pk | pk_ordcon | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_ord | 医嘱主键 | pk_ord | varchar(20) |  | 字符串 (String) |
| 5 | eu_contype | 会诊形式 | eu_contype | int |  | 整数 (Integer) |
| 6 | dt_contype | 会诊级别 | dt_contype | varchar(50) |  | 字符串 (String) |
| 7 | pk_contype | 会诊级别主键 | pk_contype | varchar(20) |  | 医师医疗项目权限分类(自定义档案) (Defdoc-010305) |
| 8 | flag_ns | 护理参加标志 | flag_ns | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_org_con | 会诊机构 | pk_org_con | varchar(20) |  | 字符串 (String) |
| 10 | pk_dept_con | 会诊科室 | pk_dept_con | varchar(20) |  | 字符串 (String) |
| 11 | desc_con | 会诊内容 | desc_con | varchar(4000) |  | 字符串 (String) |
| 12 | date_con | 会诊时间 | date_con | char(19) |  | 日期时间 (UFDateTime) |
| 13 | pk_psn_phy | 会诊医生主键 | pk_psn_phy | varchar(20) |  | 用户 (user) |
| 14 | name_psn_phy | 会诊医生姓名 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 15 | pk_psn_ns | 会诊护士主键 | pk_psn_ns | varchar(20) |  | 用户 (user) |
| 16 | name_psn_ns | 会诊护士姓名 | name_psn_ns | varchar(50) |  | 字符串 (String) |
| 17 | desc_conbl | 病历摘要 | desc_conbl | varchar(4000) |  | 字符串 (String) |
| 18 | target_con | 会诊目的 | target_con | varchar(4000) |  | 字符串 (String) |
| 19 | save_sign_ca | 签署标志 | save_sign_ca | varchar(200) |  | 字符串 (String) |
| 20 | opinion | 会诊意见 | opinion | varchar(4000) |  | 字符串 (String) |
| 21 | signtory_date | 签署日期 | signtory_date | char(19) |  | 日期时间 (UFDateTime) |
| 22 | signtory_phy | 保存意见医师 | signtory_phy | varchar(100) |  | 字符串 (String) |
| 23 | psn_signpic | 签名图片 | psn_signpic | image |  | BLOB (BLOB) |
| 24 | psnpk_ca | 签署医师 | psnpk_ca | varchar(20) |  | 字符串 (String) |
| 25 | signtory_ca | 签署密文 | signtory_ca | varchar(50) |  | 字符串 (String) |
| 26 | is_dianming | 是否点名 | is_dianming | varchar(5) |  | 字符串 (String) |
| 27 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 28 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 29 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 30 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 31 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 32 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 33 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 34 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 35 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 36 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 37 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 38 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 39 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 40 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |