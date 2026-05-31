# |<<

**病区日报v2 (uh_mdr_dar_v2 / nc.vo.nhex.component.WardDailyV2)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6126.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mdrdar | 主键 | pk_mdrdar | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_dept_ns | 护理单元 | pk_dept_ns | varchar(20) |  | 字符串 (String) |
| 5 | date_sa | 统计日期 | date_sa | char(19) |  | 日期 (UFDate) |
| 6 | n_bc | 病床 | n_bc | int |  | 整数 (Integer) |
| 7 | n_yy | 原有 | n_yy | int |  | 整数 (Integer) |
| 8 | n_xr | 新入 | n_xr | int |  | 整数 (Integer) |
| 9 | n_zr | 转入 | n_zr | int |  | 整数 (Integer) |
| 10 | n_zc | 转出 | n_zc | int |  | 整数 (Integer) |
| 11 | n_cy | 出院 | n_cy | int |  | 整数 (Integer) |
| 12 | n_sw | 死亡 | n_sw | int |  | 整数 (Integer) |
| 13 | n_xy | 现院 | n_xy | int |  | 整数 (Integer) |
| 14 | n_th | 瘫痪 | n_th | int |  | 整数 (Integer) |
| 15 | n_cr | 褥疮 | n_cr | int |  | 整数 (Integer) |
| 16 | n_gr | 感染 | n_gr | int |  | 整数 (Integer) |
| 17 | n_ph | 陪护 | n_ph | int |  | 整数 (Integer) |
| 18 | n_fm | 分娩 | n_fm | int |  | 整数 (Integer) |
| 19 | n_zhc | 坠床 | n_zhc | int |  | 整数 (Integer) |
| 20 | n_sy | 输液 | n_sy | int |  | 整数 (Integer) |
| 21 | n_bz | 病重 | n_bz | int |  | 整数 (Integer) |
| 22 | n_bw | 病危 | n_bw | int |  | 整数 (Integer) |
| 23 | n_qj | 抢救 | n_qj | int |  | 整数 (Integer) |
| 24 | n_cg | 成功 | n_cg | int |  | 整数 (Integer) |
| 25 | n_ss | 手术 | n_ss | int |  | 整数 (Integer) |
| 26 | n_jc | 加床 | n_jc | int |  | 整数 (Integer) |
| 27 | n_lg | 留观 | n_lg | int |  | 整数 (Integer) |
| 28 | n_sx | 输血 | n_sx | int |  | 整数 (Integer) |
| 29 | n_sxfy | 输血反应 | n_sxfy | int |  | 整数 (Integer) |
| 30 | n_1h | 一级护理 | n_1h | int |  | 整数 (Integer) |
| 31 | n_2h | 二级护理 | n_2h | int |  | 整数 (Integer) |
| 32 | n_3h | 三级护理 | n_3h | int |  | 整数 (Integer) |
| 33 | n_tw | 特级护理 | n_tw | int |  | 整数 (Integer) |
| 34 | n_gwycpg | 高危压疮评估 | n_gwycpg | int |  | 整数 (Integer) |
| 35 | n_gwyczcr | 高危压疮占床日数 | n_gwyczcr | int |  | 整数 (Integer) |
| 36 | n_zrhs | 责任护士数 | n_zrhs | int |  | 整数 (Integer) |
| 37 | flag_commit | 提交状态 | flag_commit | char(1) |  | 字符串 (String) |
| 38 | flag_check | 审核状态 | flag_check | char(1) |  | 字符串 (String) |
| 39 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 40 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 41 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 42 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |