# |<<

**凭证编码最大号表 (bcs_vouchermaxno / nc.vo.bm.vouch.VoucherMaxNoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/291.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchermaxno | 主键 | pk_vouchermaxno | char(20) | √ | 主键 (UFID) |
| 2 | pk_hbscheme | 合并方案pk | pk_hbscheme | varchar(20) |  | 字符串 (String) |
| 3 | alone_id | alone_id | alone_id | varchar(64) |  | 字符串 (String) |
| 4 | vouch_type | 凭证类型 | vouch_type | int |  | 整数 (Integer) |
| 5 | maxno | 最大号 | maxno | int |  | 整数 (Integer) |