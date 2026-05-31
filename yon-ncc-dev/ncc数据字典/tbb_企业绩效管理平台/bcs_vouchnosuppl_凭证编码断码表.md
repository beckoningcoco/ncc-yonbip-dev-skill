# |<<

**凭证编码断码表 (bcs_vouchnosuppl / nc.vo.bm.vouch.VouchnosupplVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/292.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouchernosuppl | 主键 | pk_vouchernosuppl | char(20) | √ | 主键 (UFID) |
| 2 | pk_vouchermaxno | 对应最大编码pk | pk_vouchermaxno | varchar(20) |  | 凭证编码最大号表 (bcs_vouchermaxno) |
| 3 | num | 断码号 | num | int |  | 整数 (Integer) |