# |<<

**临床_医嘱_频次执行时刻 (uh_cn_oupt_ord_freqplan / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcOrdFreqplanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6036.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordfreqex | 医嘱频次执行时刻主键 | pk_ordfreqex | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 字符串 (String) |
| 5 | sortno | 频次执行时刻序号 | sortno | int |  | 整数 (Integer) |
| 6 | eu_wdno | 对应星期或日 | eu_wdno | int |  | 整数 (Integer) |
| 7 | time_freqex | 执行时刻 | time_freqex | char(8) |  | 时间 (UFTime) |
| 8 | desc_freqex | 执行时刻描述 | desc_freqex | varchar(256) |  | 字符串 (String) |
| 9 | quan_med | 用量 | quan_med | decimal(28, 2) |  | 数值 (UFDouble) |
| 10 | pk_measdoc | 用量单位 | pk_measdoc | varchar(20) |  | 字符串 (String) |