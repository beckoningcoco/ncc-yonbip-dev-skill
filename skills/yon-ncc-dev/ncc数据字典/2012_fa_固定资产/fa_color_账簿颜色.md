# |<<

**账簿颜色 (fa_color / nc.vo.fa.option.ColorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2003.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_color | 主键 | pk_color | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | accbook | 账簿 | accbook | varchar(50) |  | 字符串 (String) |
| 4 | start_color | 期初颜色 | start_color | int |  | 整数 (Integer) |
| 5 | sub_color | 小计颜色 | sub_color | int |  | 整数 (Integer) |
| 6 | total_color | 合计颜色 | total_color | int |  | 整数 (Integer) |
| 7 | detal_color | 明细颜色 | detal_color | int |  | 整数 (Integer) |
| 8 | color1 | 颜色1 | color1 | int |  | 整数 (Integer) |
| 9 | color2 | 颜色2 | color2 | int |  | 整数 (Integer) |
| 10 | memo1 | 备注1 | memo1 | varchar(1024) |  | 备注 (Memo) |
| 11 | memo2 | 备注2 | memo2 | varchar(1024) |  | 备注 (Memo) |
| 12 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |