# |<<

**诊疗项目信息 (uh_hp_hostreat / com.yonyou.yh.nhis.hp.hp.vo.HpHosTreatVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6120.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hostreat | 主键 | pk_hostreat | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | srv_code | 项目编码 | srv_code | varchar(20) |  | 字符串 (String) |
| 5 | srv_name | 项目名称 | srv_name | varchar(100) |  | 字符串 (String) |
| 6 | cate_fee | 收费类别 | cate_fee | varchar(3) |  | 字符串 (String) |
| 7 | cate_pay | 报销类别 | cate_pay | varchar(3) |  | 字符串 (String) |
| 8 | maxprice | 最高价格 | maxprice | varchar(8) |  | 字符串 (String) |
| 9 | unit | 单位 | unit | varchar(10) |  | 字符串 (String) |
| 10 | code_pinyin | 拼音码 | code_pinyin | varchar(8) |  | 字符串 (String) |
| 11 | code_wubi | 五笔码 | code_wubi | varchar(8) |  | 字符串 (String) |
| 12 | psn_oper | 经办人 | psn_oper | varchar(20) |  | 字符串 (String) |
| 13 | status_report | 上报状态 | status_report | int |  | 整数 (Integer) |
| 14 | date_report | 上报时间 | date_report | char(19) |  | 日期 (UFDate) |
| 15 | pk_hp | 医保主键 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 16 | hpcode | 医保编码 | hpcode | varchar(50) |  | 字符串 (String) |