# |<<

**汇兑损益定义主体 (gl_transrate / nc.vo.gl.transrate.TransrateVoucherVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2494.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transrate | 汇兑主体标识 | pk_transrate | char(20) | √ | 主键 (UFID) |
| 2 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 3 | note | 转账说明 | note | varchar(256) | √ | 字符串 (String) |
| 4 | billnum | 单据数 | billnum | int |  | 整数 (Integer) |
| 5 | cycletime | 周期 | cycletime | varchar(50) |  | 字符串 (String) |
| 6 | execfreq | 执行频率 | execfreq | varchar(50) |  | 字符串 (String) |
| 7 | pk_operator | 定义人 | pk_operator | varchar(20) |  | 用户 (user) |
| 8 | transferno | 编号 | transferno | varchar(28) | √ | 字符串 (String) |
| 9 | pk_accsubjprofit | 收益科目 | pk_accsubjprofit | varchar(20) |  | 会计科目 (accasoa) |
| 10 | pk_accsubjpl | 损益科目 | pk_accsubjpl | varchar(20) |  | 会计科目 (accasoa) |
| 11 | pk_accsubjloss | 损失科目 | pk_accsubjloss | varchar(20) |  | 会计科目 (accasoa) |
| 12 | asspl | 损益科目辅助核算 | asspl | varchar(1000) |  | 字符串 (String) |
| 13 | assprofit | 收益科目辅助核算 | assprofit | varchar(1000) |  | 字符串 (String) |
| 14 | assloss | 损失科目辅助核算 | assloss | varchar(1000) |  | 字符串 (String) |
| 15 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 16 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 17 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织 (org) |
| 18 | currtproperty | 入账币种值 | currtproperty | int |  | 整数 (Integer) | 0 |
| 19 | autowriteoff | 下月自动回冲 | autowriteoff | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 21 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 22 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 23 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |