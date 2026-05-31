# |<<

**临床_医嘱_病理申请单属性 (uh_cn_ord_pe / com.yonyou.yh.nhis.cn.ord.v2.vo.CNOrdPeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6029.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpe | 病理属性主键 | pk_ordpe | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_ord | 医嘱主键 | pk_ord | varchar(20) |  | 临床_医嘱 (cnorder) |
| 5 | disease_hist | 既往病史 | disease_hist | varchar(256) |  | 字符串 (String) |
| 6 | symp | 症状 | symp | varchar(256) |  | 字符串 (String) |
| 7 | sign | 体征 | sign | varchar(256) |  | 字符串 (String) |
| 8 | desc_opt | 手术所见 | desc_opt | varchar(256) |  | 字符串 (String) |
| 9 | exam_aux | 辅助检查结果 | exam_aux | varchar(256) |  | 字符串 (String) |
| 10 | desc_diag | 临床诊断说明 | desc_diag | varchar(256) |  | 字符串 (String) |
| 11 | samp | 送检标本 | samp | varchar(256) |  | 字符串 (String) |
| 12 | part_body | 取材部位 | part_body | varchar(256) |  | 字符串 (String) |
| 13 | date_fm | 初次月经 | date_fm | char(19) |  | 日期时间 (UFDateTime) |
| 14 | cycle | 周期 | cycle | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | duration | 月经持续时长(天) | duration | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | date_lm | 末次月经 | date_lm | char(19) |  | 日期时间 (UFDateTime) |
| 17 | ts_pren | 怀孕次数 | ts_pren | decimal(14, 2) |  | 数值 (UFDouble) |
| 18 | ts_labor | 生产次数 | ts_labor | decimal(14, 2) |  | 数值 (UFDouble) |
| 19 | ts_abt | 流产次数 | ts_abt | decimal(14, 2) |  | 数值 (UFDouble) |
| 20 | date_ll | 末次生产时间 | date_ll | char(19) |  | 日期时间 (UFDateTime) |
| 21 | date_tum | 肿瘤发现日期 | date_tum | char(19) |  | 日期时间 (UFDateTime) |
| 22 | part_tum | 发生部位 | part_tum | varchar(256) |  | 字符串 (String) |
| 23 | size_tum | 肿瘤大小 | size_tum | varchar(256) |  | 字符串 (String) |
| 24 | spd_tum | 生长速度 | spd_tum | varchar(256) |  | 字符串 (String) |
| 25 | flag_met | 是否转移 | flag_met | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | desc_treat | 肿瘤治疗说明 | desc_treat | varchar(256) |  | 字符串 (String) |
| 27 | flag_pe | 是否既往病理检查 | flag_pe | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | code_pe | 既往病理检查号 | code_pe | varchar(256) |  | 字符串 (String) |
| 29 | diag_pe | 既往病理诊断 | diag_pe | varchar(256) |  | 字符串 (String) |
| 30 | eu_status | 检查过程状态 | eu_status | int |  | 整数 (Integer) |
| 31 | pe_type | 检查方法 | pe_type | varchar(256) |  | 字符串 (String) |
| 32 | name_infect | 传染病名称 | name_infect | varchar(256) |  | 字符串 (String) |
| 33 | hos_diag | 既往病理诊断医院 | hos_diag | varchar(256) |  | 字符串 (String) |
| 34 | date_diag | 既往病理检查时间 | date_diag | char(19) |  | 日期时间 (UFDateTime) |
| 35 | met_body | 转移部位 | met_body | varchar(256) |  | 字符串 (String) |
| 36 | flag_che | 有无化疗 | flag_che | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | me_his | 月经历史 | me_his | varchar(256) |  | 字符串 (String) |
| 38 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 39 | fixed_liquid | 固定液 | fixed_liquid | varchar(256) |  | 字符串 (String) |
| 40 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 41 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 42 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 43 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 44 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 45 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 46 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 47 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 48 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 49 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |