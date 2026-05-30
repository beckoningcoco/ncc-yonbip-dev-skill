# |<<

**医保结算分解 (uh_bl_hp_segm / com.yonyou.yh.nhis.hp.vo.BLHpSegmVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5931.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stdt | 主键 | pk_stdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_hpst | 医保结算主键 | pk_hpst | varchar(20) |  | 字符串 (String) |
| 5 | pk_hpsegm | 支付方式主键 | pk_hpsegm | varchar(20) |  | 字符串 (String) |
| 6 | segmcode | 支付方式编码 | segmcode | varchar(50) |  | 字符串 (String) |
| 7 | segmname | 支付方式名称 | segmname | varchar(50) |  | 字符串 (String) |
| 8 | amount | 支付金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | segmvalue | 支付值 | segmvalue | varchar(500) |  | 字符串 (String) |
| 10 | pk_hp | 所属医保 | pk_hp | varchar(20) |  | 字符串 (String) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |