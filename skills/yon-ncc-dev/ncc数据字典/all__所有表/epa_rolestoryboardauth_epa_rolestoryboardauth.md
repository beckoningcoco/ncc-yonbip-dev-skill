# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7928.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | createtime | createtime | createtime | varchar2(50) |
| 3 | edit | edit | edit | char(1) |
| 4 | mobilebrowse | mobilebrowse | mobilebrowse | char(1) |
| 5 | pcbrowse | pcbrowse | pcbrowse | char(1) |
| 6 | roleid | roleid | roleid | char(20) | √ |
| 7 | storyboardid | storyboardid | storyboardid | char(20) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |