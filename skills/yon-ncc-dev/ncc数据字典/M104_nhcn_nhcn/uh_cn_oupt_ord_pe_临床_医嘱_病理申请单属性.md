# |<<

**临床_医嘱_病理申请单属性 (uh_cn_oupt_ord_pe / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcOrdPeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6041.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpe | 病理属性主键 | pk_ordpe | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_ord | 医嘱主键 | pk_ord | varchar(20) |  | 字符串 (String) |
| 5 | disease_hist | 既往病史 | disease_hist | varchar(256) |  | 字符串 (String) |
| 6 | symp | 症状 | symp | varchar(256) |  | 字符串 (String) |
| 7 | sign | 体征 | sign | varchar(256) |  | 字符串 (String) |
| 8 | desc_opt | 手术所见 | desc_opt | varchar(256) |  | 字符串 (String) |
| 9 | exam_aux | 辅助检查结果 | exam_aux | varchar(256) |  | 字符串 (String) |
| 10 | desc_diag | 临床诊断说明 | desc_diag | varchar(256) |  | 字符串 (String) |
| 11 | samp | 送检标本 | samp | varchar(256) |  | 字符串 (String) |
| 12 | part_body | 取材部位 | part_body | varchar(256) |  | 字符串 (String) |
| 13 | date_fm | 初次月经 | date_fm | char(19) |  | 日期 (UFDate) |
| 14 | cycle | 周期 | cycle | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | duration | 月经持续时长(天) | duration | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | date_lm | 末次月经 | date_lm | char(19) |  | 日期 (UFDate) |
| 17 | ts_pren | 怀孕次数 | ts_pren | decimal(14, 2) |  | 数值 (UFDouble) |
| 18 | ts_labor | 生产次数 | ts_labor | decimal(14, 2) |  | 数值 (UFDouble) |
| 19 | ts_abt | 流产次数 | ts_abt | decimal(14, 2) |  | 数值 (UFDouble) |
| 20 | date_ll | 末次生产时间 | date_ll | char(19) |  | 日期 (UFDate) |
| 21 | date_tum | 肿瘤发现日期 | date_tum | char(19) |  | 日期 (UFDate) |
| 22 | part_tum | 发生部位 | part_tum | varchar(256) |  | 字符串 (String) |
| 23 | size_tum | 肿瘤大小 | size_tum | varchar(256) |  | 字符串 (String) |
| 24 | spd_tum | 生长速度 | spd_tum | varchar(256) |  | 字符串 (String) |
| 25 | flag_met | 是否转移 | flag_met | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | desc_treat | 肿瘤治疗说明 | desc_treat | varchar(256) |  | 字符串 (String) |
| 27 | flag_pe | 是否既往病理检查 | flag_pe | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | code_pe | 既往病理检查号 | code_pe | varchar(256) |  | 字符串 (String) |
| 29 | diag_pe | 既往病理诊断 | diag_pe | varchar(256) |  | 字符串 (String) |
| 30 | eu_status | 检查过程状态 | eu_status | int |  | 整数 (Integer) |