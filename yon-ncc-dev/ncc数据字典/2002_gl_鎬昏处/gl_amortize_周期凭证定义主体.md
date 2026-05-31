# |<<

**周期凭证定义主体 (gl_amortize / nc.vo.gl.amortize.setting.AmortizeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2345.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_amortize | 周期凭证定义主体标识 | pk_amortize | char(20) | √ | 主键 (UFID) |
| 2 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 3 | amortizeno | 编号 | amortizeno | varchar(50) |  | 字符串 (String) |
| 4 | amortizename | 名称 | amortizename | varchar(50) |  | 字符串 (String) |
| 5 | speriod | 起始期间 | speriod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | cycle | 周期 | cycle | int |  | 整数 (Integer) |
| 7 | time | 时间 | time | varchar(50) |  | 字符串 (String) |
| 8 | state | 状态 | state | varchar(50) |  | 状态 (amortizestate) |  | 0=未执行; |