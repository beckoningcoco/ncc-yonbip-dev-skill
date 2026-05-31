# |<<

**凭证自定义项 (gl_vchfreevalue / nc.vo.gl.gl_uiconfig.Entity)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2498.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vchfreevalue | 凭证自定义主键 | pk_vchfreevalue | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_voucher | 凭证标识 | pk_voucher | varchar(20) |  | 实时凭证主体 (gl_rtvoucher) |
| 4 | freevalue1 | 自定义项1 | freevalue1 | varchar(200) |  | 字符串 (String) |
| 5 | freevalue2 | 自定义项2 | freevalue2 | varchar(200) |  | 字符串 (String) |
| 6 | freevalue3 | 自定义项3 | freevalue3 | varchar(200) |  | 字符串 (String) |
| 7 | freevalue4 | 自定义项4 | freevalue4 | varchar(101) |  | 自定义项 (Custom) |
| 8 | freevalue5 | 自定义项5 | freevalue5 | varchar(101) |  | 自定义项 (Custom) |