# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11031.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_mobile_record | pk_wf_mobile_record | pk_wf_mobile_record | varchar2(20) | √ |
| 2 | moduleid | moduleid | moduleid | varchar2(200) |
| 3 | new_version | new_version | new_version | varchar2(100) |
| 4 | old_version | old_version | old_version | varchar2(100) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |