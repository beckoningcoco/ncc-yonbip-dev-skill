# |<<

**esb失败记录 (bd_uh_esb_error / com.yonyou.yh.nhis.esb.vo.EsbErrorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1029.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_esberror | esb错误记录主键 | pk_esberror | char(20) | √ | 主键 (UFID) |
| 2 | esb_resson | esb错误原因记录 | esb_resson | varchar(256) |  | 字符串 (String) |
| 3 | esb_values | esb调用时需要的数据 | esb_values | varchar(4000) |  | 字符串 (String) |
| 4 | flag_check | 是否重新提交成功 | flag_check | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | usebp | 使用的bp | usebp | varchar(50) |  | 字符串 (String) |