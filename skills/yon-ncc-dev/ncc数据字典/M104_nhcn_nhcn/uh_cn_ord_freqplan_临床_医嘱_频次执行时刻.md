# |<<

**临床_医嘱_频次执行时刻 (uh_cn_ord_freqplan / com.yonyou.yh.nhis.cn.ord.v2.vo.CNOrdFreqplanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6022.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordfreqex | 医嘱频次执行时刻主键 | pk_ordfreqex | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 临床_医嘱 (cnorder) |
| 5 | sortno | 频次执行时刻序号 | sortno | int |  | 整数 (Integer) |
| 6 | eu_wdno | 对应星期或日 | eu_wdno | int |  | 整数 (Integer) |
| 7 | time_freqex | 执行时刻 | time_freqex | char(8) |  | 时间 (UFTime) |
| 8 | desc_freqex | 执行时刻描述 | desc_freqex | varchar(256) |  | 字符串 (String) |
| 9 | quan_med | 用量 | quan_med | decimal(28, 2) |  | 数值 (UFDouble) |
| 10 | pk_measdoc | 用量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 11 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 12 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 13 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 14 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 15 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 16 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 17 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 18 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 19 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 20 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |