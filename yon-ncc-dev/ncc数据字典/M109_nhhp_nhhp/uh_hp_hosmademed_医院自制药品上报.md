# |<<

**医院自制药品上报 (uh_hp_hosmademed / com.yonyou.yh.nhis.hp.hp.vo.HpHosMadMedVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6119.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hosmadmed | 主键 | pk_hosmadmed | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code_med | 药品编码 | code_med | varchar(20) |  | 字符串 (String) |
| 5 | name_med | 药品商品名 | name_med | varchar(100) |  | 字符串 (String) |
| 6 | dose_unit | 剂量单位 | dose_unit | varchar(20) |  | 字符串 (String) |
| 7 | usage | 用法 | usage | varchar(100) |  | 字符串 (String) |
| 8 | dosage | 每次用量 | dosage | varchar(8) |  | 字符串 (String) |
| 9 | freq | 使用频次 | freq | varchar(100) |  | 字符串 (String) |
| 10 | dosageform | 剂型 | dosageform | varchar(20) |  | 字符串 (String) |
| 11 | unit | 单位 | unit | varchar(10) |  | 字符串 (String) |
| 12 | specif | 规格 | specif | varchar(100) |  | 字符串 (String) |
| 13 | days | 限定天数 | days | varchar(8) |  | 字符串 (String) |
| 14 | pinyincode | 拼音码 | pinyincode | varchar(8) |  | 字符串 (String) |
| 15 | wubicode | 五笔码 | wubicode | varchar(8) |  | 字符串 (String) |
| 16 | med_com_name | 药厂名称 | med_com_name | varchar(100) |  | 字符串 (String) |
| 17 | homemade_med | 自制药品标志 | homemade_med | varchar(3) |  | 字符串 (String) |
| 18 | cate_med | 药品种类 | cate_med | varchar(3) |  | 字符串 (String) |
| 19 | country_med | 国药种类 | country_med | varchar(100) |  | 字符串 (String) |
| 20 | psn_oper | 经办人 | psn_oper | varchar(20) |  | 字符串 (String) |
| 21 | status_report | 上报状态 | status_report | int |  | 整数 (Integer) |
| 22 | date_report | 上报时间 | date_report | char(19) |  | 日期 (UFDate) |
| 23 | pk_hp | 医保主键 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 24 | hpcode | 医保编码 | hpcode | varchar(50) |  | 字符串 (String) |